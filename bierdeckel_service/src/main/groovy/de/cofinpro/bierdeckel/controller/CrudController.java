package de.cofinpro.bierdeckel.controller;

import de.cofinpro.bierdeckel.domain.AbsEntity;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: cfinkelstein
 * Date: 20.09.13
 * Time: 18:38
 * To change this template use File | Settings | File Templates.
 */
interface CrudController<T extends AbsEntity>  {

    T save(T entity);
    T update(T entity);
    T findForId(String id);
    List<T> findAll();
    List<T> findAll(int page, int itemsPerPage);

}
