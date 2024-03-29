package models;

import javax.persistence.*;
import play.data.validation.Required;
import play.db.jpa.*;
import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.List;
import play.data.validation.Required;
import play.db.jpa.Model;




@Entity
public class Marque extends Model {

	@Required
	public String nomMarque;
	
	 @OneToMany(mappedBy="marque", cascade=CascadeType.ALL)
        public List<Produit> produit = new ArrayList();
		
	public Marque( String nomMarque) {
		super();
		
		this.nomMarque = nomMarque;
	}

	@Override
	public String toString() {
		return nomMarque;
	}

}