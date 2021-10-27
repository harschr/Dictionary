
package dictionary.dao;

import dictionary.model.Word;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Set;

public interface DictionaryRepository {
    
    void insert (Word word);
    
    int dictLength ();
    
     int dictLengthWithCat(String category);
    
    Word findById(int id);
    
    ArrayList<Word> listByCat(String category);
    
     Word makeOneWord (ResultSet rs);
     
    ArrayList<Word> listAll();
    
    ArrayList<String[]> arrayAll();
   
     Set<String> findCategories ();
     /*
    void delete ();
    
    void update ();
    
     ArrayList<String[]> listAll ();
     
     */
}
