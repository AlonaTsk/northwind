package fi.vamk.e1900320.northwind;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface ReaderRepository 
    extends JpaRepository<Reader, String>{

	public Reader findByUsername(String username);

	

    }
    

