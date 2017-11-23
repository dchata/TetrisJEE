package fr.iia.tetris.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import fr.iia.tetris.model.Tetriminos;
import fr.iia.tetris.model.Utilisateurs;

@Repository
@Transactional
public class UtilisateurDAO implements IDAO<Utilisateurs>
{
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Utilisateurs find(int id) 
	{
		return em.find(Utilisateurs.class, id);
	}

	@Override
	public List<Utilisateurs> findAll() 
	{
		return (List<Utilisateurs>)em.createQuery("from Utilisateurs").getResultList();
	}

	@Override
	public Utilisateurs save(Utilisateurs object) 
	{
		return em.merge(object);
	}

	@Override
	public boolean delete(Utilisateurs object) 
	{
		try 
		{
			em.remove(em.merge(object));
			return true;
		} catch (Exception e) 
		{
			return false;
		}
	}

}
