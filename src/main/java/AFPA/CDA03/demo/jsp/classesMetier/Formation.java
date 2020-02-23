
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
@Entity
public class Formation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String theme;
    private String description;
    
    public Formation() {
      super();
    }
    
    public Long getId() {
        return this.id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getTheme() {
        return this.theme; 
    }
    
    public void setTheme( String theme) {
        this.theme = theme;
    }
    
    public String getDexcription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    
}
