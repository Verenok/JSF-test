package com.otv.user.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.otv.model.Article;

@Transactional(readOnly = true)
public class ArticleDAO implements IArticleDAO {

	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

	@Transactional(readOnly = false)
	@Override
	public void addArticle(Article article) {
		sessionFactory.getCurrentSession().save(article);
	}

	@Override
	public Article getArticle(Long articleId) {
		return (Article) sessionFactory.getCurrentSession().get(Article.class, articleId);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Article> getAll() {
		return sessionFactory.getCurrentSession().createQuery("from Article")
			.list();
	}

	@Transactional(readOnly = false)
	@Override
	public void removeArticle(Long articleId) {
		Article article = (Article) sessionFactory.getCurrentSession().load(
				Article.class, articleId);
		if (article != null) {
			sessionFactory.getCurrentSession().delete(article);
		}

	}

	@Transactional(readOnly = false)
	@Override
	public void updateArticle(Long articleId) {
		Article article = (Article) sessionFactory.getCurrentSession().load(
				Article.class, articleId);
		if (article != null) {
			sessionFactory.getCurrentSession().delete(article);
		}
		sessionFactory.getCurrentSession().save(article);

	}

}
