/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.telefonica.service.persistence;

import com.liferay.portal.NoSuchModelException;
import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.BatchSessionUtil;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.telefonica.NoSuchEmployerException;

import com.telefonica.model.Employer;
import com.telefonica.model.impl.EmployerImpl;
import com.telefonica.model.impl.EmployerModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the employer service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author carlos
 * @see EmployerPersistence
 * @see EmployerUtil
 * @generated
 */
public class EmployerPersistenceImpl extends BasePersistenceImpl<Employer>
	implements EmployerPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link EmployerUtil} to access the employer persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = EmployerImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(EmployerModelImpl.ENTITY_CACHE_ENABLED,
			EmployerModelImpl.FINDER_CACHE_ENABLED, EmployerImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(EmployerModelImpl.ENTITY_CACHE_ENABLED,
			EmployerModelImpl.FINDER_CACHE_ENABLED, EmployerImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(EmployerModelImpl.ENTITY_CACHE_ENABLED,
			EmployerModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the employer in the entity cache if it is enabled.
	 *
	 * @param employer the employer
	 */
	public void cacheResult(Employer employer) {
		EntityCacheUtil.putResult(EmployerModelImpl.ENTITY_CACHE_ENABLED,
			EmployerImpl.class, employer.getPrimaryKey(), employer);

		employer.resetOriginalValues();
	}

	/**
	 * Caches the employers in the entity cache if it is enabled.
	 *
	 * @param employers the employers
	 */
	public void cacheResult(List<Employer> employers) {
		for (Employer employer : employers) {
			if (EntityCacheUtil.getResult(
						EmployerModelImpl.ENTITY_CACHE_ENABLED,
						EmployerImpl.class, employer.getPrimaryKey()) == null) {
				cacheResult(employer);
			}
			else {
				employer.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all employers.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(EmployerImpl.class.getName());
		}

		EntityCacheUtil.clearCache(EmployerImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the employer.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Employer employer) {
		EntityCacheUtil.removeResult(EmployerModelImpl.ENTITY_CACHE_ENABLED,
			EmployerImpl.class, employer.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Employer> employers) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Employer employer : employers) {
			EntityCacheUtil.removeResult(EmployerModelImpl.ENTITY_CACHE_ENABLED,
				EmployerImpl.class, employer.getPrimaryKey());
		}
	}

	/**
	 * Creates a new employer with the primary key. Does not add the employer to the database.
	 *
	 * @param idEmployer the primary key for the new employer
	 * @return the new employer
	 */
	public Employer create(int idEmployer) {
		Employer employer = new EmployerImpl();

		employer.setNew(true);
		employer.setPrimaryKey(idEmployer);

		return employer;
	}

	/**
	 * Removes the employer with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param idEmployer the primary key of the employer
	 * @return the employer that was removed
	 * @throws com.telefonica.NoSuchEmployerException if a employer with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Employer remove(int idEmployer)
		throws NoSuchEmployerException, SystemException {
		return remove(Integer.valueOf(idEmployer));
	}

	/**
	 * Removes the employer with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the employer
	 * @return the employer that was removed
	 * @throws com.telefonica.NoSuchEmployerException if a employer with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Employer remove(Serializable primaryKey)
		throws NoSuchEmployerException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Employer employer = (Employer)session.get(EmployerImpl.class,
					primaryKey);

			if (employer == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchEmployerException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(employer);
		}
		catch (NoSuchEmployerException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected Employer removeImpl(Employer employer) throws SystemException {
		employer = toUnwrappedModel(employer);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, employer);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(employer);

		return employer;
	}

	@Override
	public Employer updateImpl(com.telefonica.model.Employer employer,
		boolean merge) throws SystemException {
		employer = toUnwrappedModel(employer);

		boolean isNew = employer.isNew();

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, employer, merge);

			employer.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(EmployerModelImpl.ENTITY_CACHE_ENABLED,
			EmployerImpl.class, employer.getPrimaryKey(), employer);

		return employer;
	}

	protected Employer toUnwrappedModel(Employer employer) {
		if (employer instanceof EmployerImpl) {
			return employer;
		}

		EmployerImpl employerImpl = new EmployerImpl();

		employerImpl.setNew(employer.isNew());
		employerImpl.setPrimaryKey(employer.getPrimaryKey());

		employerImpl.setIdEmployer(employer.getIdEmployer());
		employerImpl.setNameEmployer(employer.getNameEmployer());
		employerImpl.setIdDept(employer.getIdDept());
		employerImpl.setPhoto(employer.getPhoto());

		return employerImpl;
	}

	/**
	 * Returns the employer with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the employer
	 * @return the employer
	 * @throws com.liferay.portal.NoSuchModelException if a employer with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Employer findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Integer)primaryKey).intValue());
	}

	/**
	 * Returns the employer with the primary key or throws a {@link com.telefonica.NoSuchEmployerException} if it could not be found.
	 *
	 * @param idEmployer the primary key of the employer
	 * @return the employer
	 * @throws com.telefonica.NoSuchEmployerException if a employer with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Employer findByPrimaryKey(int idEmployer)
		throws NoSuchEmployerException, SystemException {
		Employer employer = fetchByPrimaryKey(idEmployer);

		if (employer == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + idEmployer);
			}

			throw new NoSuchEmployerException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				idEmployer);
		}

		return employer;
	}

	/**
	 * Returns the employer with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the employer
	 * @return the employer, or <code>null</code> if a employer with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Employer fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Integer)primaryKey).intValue());
	}

	/**
	 * Returns the employer with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param idEmployer the primary key of the employer
	 * @return the employer, or <code>null</code> if a employer with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Employer fetchByPrimaryKey(int idEmployer) throws SystemException {
		Employer employer = (Employer)EntityCacheUtil.getResult(EmployerModelImpl.ENTITY_CACHE_ENABLED,
				EmployerImpl.class, idEmployer);

		if (employer == _nullEmployer) {
			return null;
		}

		if (employer == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				employer = (Employer)session.get(EmployerImpl.class,
						Integer.valueOf(idEmployer));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (employer != null) {
					cacheResult(employer);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(EmployerModelImpl.ENTITY_CACHE_ENABLED,
						EmployerImpl.class, idEmployer, _nullEmployer);
				}

				closeSession(session);
			}
		}

		return employer;
	}

	/**
	 * Returns all the employers.
	 *
	 * @return the employers
	 * @throws SystemException if a system exception occurred
	 */
	public List<Employer> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the employers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of employers
	 * @param end the upper bound of the range of employers (not inclusive)
	 * @return the range of employers
	 * @throws SystemException if a system exception occurred
	 */
	public List<Employer> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the employers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of employers
	 * @param end the upper bound of the range of employers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of employers
	 * @throws SystemException if a system exception occurred
	 */
	public List<Employer> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = new Object[] { start, end, orderByComparator };

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<Employer> list = (List<Employer>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_EMPLOYER);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_EMPLOYER;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<Employer>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<Employer>)QueryUtil.list(q, getDialect(),
							start, end);
				}
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(finderPath, finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(finderPath, finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the employers from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (Employer employer : findAll()) {
			remove(employer);
		}
	}

	/**
	 * Returns the number of employers.
	 *
	 * @return the number of employers
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_EMPLOYER);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Initializes the employer persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.telefonica.model.Employer")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Employer>> listenersList = new ArrayList<ModelListener<Employer>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Employer>)InstanceFactory.newInstance(
							listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(EmployerImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@BeanReference(type = DepartmentPersistence.class)
	protected DepartmentPersistence departmentPersistence;
	@BeanReference(type = EmployerPersistence.class)
	protected EmployerPersistence employerPersistence;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private static final String _SQL_SELECT_EMPLOYER = "SELECT employer FROM Employer employer";
	private static final String _SQL_COUNT_EMPLOYER = "SELECT COUNT(employer) FROM Employer employer";
	private static final String _ORDER_BY_ENTITY_ALIAS = "employer.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Employer exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(EmployerPersistenceImpl.class);
	private static Employer _nullEmployer = new EmployerImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Employer> toCacheModel() {
				return _nullEmployerCacheModel;
			}
		};

	private static CacheModel<Employer> _nullEmployerCacheModel = new CacheModel<Employer>() {
			public Employer toEntityModel() {
				return _nullEmployer;
			}
		};
}