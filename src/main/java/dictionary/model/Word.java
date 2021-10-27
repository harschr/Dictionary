package dictionary.model;

public class Word {
    
    private Integer id;
    private String category;
    private String magyar;
    private String polski;
    private String deutsch;
    private String english;

    public Word(String category, String magyar, String polski, String deutsch, String english) {       
        this.category = category;
        this.magyar = magyar;
        this.polski = polski;
        this.deutsch = deutsch;
        this.english = english;
    }

    public Word(String category, String magyar, String polski) {
        this.category = category;
        this.magyar = magyar;
        this.polski = polski;
    }

    public Word() {
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMagyar() {
        return magyar;
    }

    public void setMagyar(String magyar) {
        this.magyar = magyar;
    }

    public String getPolski() {
        return polski;
    }

    public void setPolski(String polski) {
        this.polski = polski;
    }

    public String getDeutsch() {
        return deutsch;
    }

    public void setDeutsch(String deutsch) {
        this.deutsch = deutsch;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }
}
