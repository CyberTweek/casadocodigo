package br.com.estudos.daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.estudos.models.Produto;

@Repository
@Transactional
public class ProdutoDao {

	@PersistenceContext
	private EntityManager manager;
	
	public void gravar(Produto produto) {
		System.out.println("persistence");
		
		manager.persist(produto);
	}

	public List<Produto> listar() {

		return manager.createQuery("select p from Produto p", Produto.class).getResultList();
	}



}
