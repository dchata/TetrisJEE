package fr.iia.tetris.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import fr.iia.tetris.model.Tetriminos;

@Repository
@Transactional
public class TetriminosDAO implements IDAO<Tetriminos>
{
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Tetriminos find(int id) 
	{
		return em.find(Tetriminos.class, id);
	}

	@Override
	public List<Tetriminos> findAll() 
	{
		return (List<Tetriminos>)em.createQuery("from Tetriminos").getResultList();
	}

	@Override
	public Tetriminos save(Tetriminos object) 
	{
		return em.merge(object);
	}

	@Override
	public boolean delete(Tetriminos object) 
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
