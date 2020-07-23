package com.example.Listes_des_taches.WEB;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.Listes_des_taches.DAO.TachesRepository;
import com.example.Listes_des_taches.Entities.TACHE;

@RestController
@CrossOrigin("*")
public class TachesRestService {

	@Autowired
	private TachesRepository tachesRepository;
	
	@RequestMapping(value="/taches",method=RequestMethod.GET)
	
	public List<TACHE> listProduit()
		{return tachesRepository.findAll();}
	
	
    @RequestMapping(value="/taches/{id}",method=RequestMethod.GET)
    
    public Optional<TACHE> getProduit(@PathVariable ("id") Long id)
        {return tachesRepository.findById(id);}

    
    @RequestMapping(value="/taches",method=RequestMethod.POST)
    public TACHE saveProduit(@Valid @RequestBody TACHE p)
	    { tachesRepository.save(p);
          return p;}

    
    @RequestMapping(value="/taches/{id}",method=RequestMethod.PUT)

    public TACHE update(@Valid @RequestBody TACHE p,@PathVariable ("id") Long id)
        { p.setId(id);
	      return tachesRepository.saveAndFlush(p);}
    

    @RequestMapping(value="/taches/{id}",method=RequestMethod.DELETE)

    public void delete(@PathVariable ("id") Long id)
    	{ tachesRepository.deleteById(id);}

}
