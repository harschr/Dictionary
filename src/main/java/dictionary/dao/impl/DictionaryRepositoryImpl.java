package dictionary.dao.impl;

import dictionary.dao.DictionaryRepository;
import dictionary.model.Word;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Set;
import java.util.TreeSet;

public class DictionaryRepositoryImpl implements DictionaryRepository {

    private Connection conn;
    private PreparedStatement insert;
    private PreparedStatement countRecords;
    private PreparedStatement countRecordsWithCat;
    private PreparedStatement findById;
    private PreparedStatement listByCat;
    private PreparedStatement findCategories;
    private PreparedStatement listAll;

    public DictionaryRepositoryImpl() {
        Properties prop = new Properties();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            prop.load(DictionaryRepositoryImpl.class.getResourceAsStream("/sql.ini"));
            String url = prop.getProperty("SQL_url");
            String username = prop.getProperty("SQL_username");
            String password = prop.getProperty("SQL_password");
            conn = DriverManager.getConnection(url, username, password);
        } catch (SQLException ex) {
            System.err.println("Error when creating database connection! Message: " + ex.getMessage());
        } catch (IOException exIO) {
            System.err.println(exIO.getMessage());
        } catch (Exception exEx) {
            System.out.println(exEx.getMessage());
        }

        try {
            this.conn = conn;
            this.insert = conn.prepareStatement("INSERT INTO dictionary.words (category, magyar, polski, deutsch, english) VALUES (?,?,?,?,?)");
            this.countRecords = conn.prepareStatement("SELECT COUNT(*) FROM dictionary.words");
            this.countRecordsWithCat = conn.prepareStatement("SELECT COUNT(*) FROM dictionary.words WHERE category = ?");
            this.findById = conn.prepareStatement("SELECT * FROM dictionary.words WHERE id = ?");
            this.listByCat = conn.prepareStatement("SELECT * FROM dictionary.words WHERE category = ?");
            this.findCategories = conn.prepareStatement("SELECT category FROM dictionary.words");
            this.listAll = conn.prepareStatement("SELECT * FROM dictionary.words");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void insert(Word word) {
        try {
            this.insert.setString(1, word.getCategory());
            this.insert.setString(2, word.getMagyar());
            this.insert.setString(3, word.getPolski());
            this.insert.setString(4, word.getDeutsch());
            this.insert.setString(5, word.getEnglish());
            this.insert.executeUpdate();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public int dictLength() {
        try {
            ResultSet rs = this.countRecords.executeQuery();
            while (rs.next()) {
                return rs.getInt("COUNT(*)");
            }
            rs.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return 0;
    }

    @Override
    public int dictLengthWithCat(String category) {
        try {
            this.countRecordsWithCat.setString(1, category);
            ResultSet rs = this.countRecordsWithCat.executeQuery();
            while (rs.next()) {
                return rs.getInt("COUNT(*)");
            }
            rs.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return 0;
    }

    @Override
    public Word findById(int id) {
        Word word = new Word();
        try {
            this.findById.setInt(1, id);
            ResultSet rs = this.findById.executeQuery();
            word = makeOneWord(rs);
            rs.close();
            return word;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return word;
    }

    @Override
    public ArrayList<Word> listAll() {
        ArrayList<Word> wordList = new ArrayList<>();
        try {
            ResultSet rs = listAll.executeQuery();
            while (rs.next()) {
                Word word = new Word();
                word.setId(rs.getInt("id"));
                word.setCategory(rs.getString("category"));
                word.setMagyar(rs.getString("magyar"));
                word.setPolski(rs.getString("polski"));
                word.setDeutsch(rs.getString("deutsch"));
                word.setEnglish(rs.getString("english"));
                wordList.add(word);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return wordList;
    }
    
    @Override
    public ArrayList<String[]> arrayAll() {
        ArrayList<String[]> wordArray = new ArrayList<String[]>();
        try {
            ResultSet rs = listAll.executeQuery();
            while (rs.next()) {
                String[] tbData = new String[6];
                tbData[0] = String.valueOf(rs.getInt("id"));
                tbData[1] = rs.getString("category");
                tbData[2] = rs.getString("magyar");
                tbData[3] = rs.getString("polski");
                wordArray.add(tbData);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return wordArray;
    }

    @Override
    public ArrayList<Word> listByCat(String category) {
        ArrayList<Word> wordList = new ArrayList<>();      
        try {
            this.listByCat.setString(1, category);
            ResultSet rs = this.listByCat.executeQuery();
            while (rs.next()) {
               Word word = new Word();
                word.setId(rs.getInt("id"));
                word.setCategory(rs.getString("category"));
                word.setMagyar(rs.getString("magyar"));
                word.setPolski(rs.getString("polski"));
                word.setDeutsch(rs.getString("deutsch"));
                word.setEnglish(rs.getString("english"));
                wordList.add(word);
            }
            rs.close();
            return wordList;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return wordList;
    }

    @Override
    public Set<String> findCategories() {
        Set<String> categories = new TreeSet<>();
        try {
            ResultSet rs = this.findCategories.executeQuery();
            while (rs.next()) {
                categories.add(rs.getString("category"));
            }
            rs.close();
            return categories;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return categories;
    }

    @Override
    public Word makeOneWord(ResultSet rs) {
        try {
            while (rs.next()) {
                Word word = new Word();
                word.setId(rs.getInt("id"));
                word.setCategory(rs.getString("category"));
                word.setMagyar(rs.getString("magyar"));
                word.setPolski(rs.getString("polski"));
                word.setDeutsch(rs.getString("deutsch"));
                word.setEnglish(rs.getString("english"));
                return word;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return null;
    }
}
