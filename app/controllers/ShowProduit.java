package controllers;

import java.util.*;

import com.sun.security.ntlm.Client;
import play.db.helper.SqlQuery;
import play.*;
import play.mvc.*;
import play.data.validation.*; 
import models.*;
import play.libs.*;
import play.cache.*;


public class ShowProduit extends Controller {
 
	public static void index() {
		
		List<Produit> listeProduit = Produit.find("order by modelprod").fetch();
		render(listeProduit);
    }

}
