package com.chieftain.blockchaininfo.dao.tickerdata;

import com.chieftain.blockchaininfo.dao.JpaDao;
import com.chieftain.blockchaininfo.entity.TickerData;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class JpaTickerDataDao extends JpaDao<TickerData, Long> implements TickerDataDao {
	public JpaTickerDataDao() {
		super(TickerData.class);
	}

	@Override
	@Transactional(readOnly = true)
	public List<TickerData> findAll() {
		final CriteriaBuilder builder = this.getEntityManager().getCriteriaBuilder();
		final CriteriaQuery<TickerData> criteriaQuery = builder.createQuery(TickerData.class);

		Root<TickerData> root = criteriaQuery.from(TickerData.class);

		TypedQuery<TickerData> typedQuery = this.getEntityManager().createQuery(criteriaQuery);
		return typedQuery.getResultList();
	}


}
