package edu.poly.shop.service.impl;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import edu.poly.shop.domain.Category;
import edu.poly.shop.repository.CategoryRepository;
import edu.poly.shop.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService{
	
   CategoryRepository categoryRepositorys;

       public CategoryServiceImpl(CategoryRepository categoryRepositorys) {
	
       	this.categoryRepositorys = categoryRepositorys;
       }

	@Override
	public List<Category> findByNameContaining(String name) {
		return categoryRepositorys.findByNameContaining(name);
	}

	@Override
	public Page<Category> findByNameContaining(String name, Pageable pageable) {
		return categoryRepositorys.findByNameContaining(name, pageable);
	}

	@Override
	public <S extends Category> S save(S entity) {
		return categoryRepositorys.save(entity);
	}

	@Override
	public <S extends Category> Optional<S> findOne(Example<S> example) {
		return categoryRepositorys.findOne(example);
	}

	@Override
	public List<Category> findAll() {
		return categoryRepositorys.findAll();
	}

	@Override
	public Page<Category> findAll(Pageable pageable) {
		return categoryRepositorys.findAll(pageable);
	}

	@Override
	public List<Category> findAll(Sort sort) {
		return categoryRepositorys.findAll(sort);
	}

	@Override
	public List<Category> findAllById(Iterable<Long> ids) {
		return categoryRepositorys.findAllById(ids);
	}

	@Override
	public Optional<Category> findById(Long id) {
		return categoryRepositorys.findById(id);
	}

	@Override
	public <S extends Category> List<S> saveAll(Iterable<S> entities) {
		return categoryRepositorys.saveAll(entities);
	}

	@Override
	public void flush() {
		categoryRepositorys.flush();
	}

	@Override
	public boolean existsById(Long id) {
		return categoryRepositorys.existsById(id);
	}

	@Override
	public <S extends Category> S saveAndFlush(S entity) {
		return categoryRepositorys.saveAndFlush(entity);
	}

	@Override
	public <S extends Category> List<S> saveAllAndFlush(Iterable<S> entities) {
		return categoryRepositorys.saveAllAndFlush(entities);
	}

	@Override
	public void deleteAllInBatch(Iterable<Category> entities) {
		categoryRepositorys.deleteAllInBatch(entities);
	}

	@Override
	public long count() {
		return categoryRepositorys.count();
	}

	@Override
	public <S extends Category> boolean exists(Example<S> example) {
		return categoryRepositorys.exists(example);
	}

	@Override
	public void deleteById(Long id) {
		categoryRepositorys.deleteById(id);
	}

	@Override
	public void deleteAllByIdInBatch(Iterable<Long> ids) {
		categoryRepositorys.deleteAllByIdInBatch(ids);
	}

	@Override
	public void delete(Category entity) {
		categoryRepositorys.delete(entity);
	}

	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
		categoryRepositorys.deleteAllById(ids);
	}

	@Override
	public void deleteAllInBatch() {
		categoryRepositorys.deleteAllInBatch();
	}

	@Override
	public void deleteAll(Iterable<? extends Category> entities) {
		categoryRepositorys.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		categoryRepositorys.deleteAll();
	}

	@Override
	public Category getById(Long id) {
		return categoryRepositorys.getById(id);
	}
       
}
