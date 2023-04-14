package lab5.ex1;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Expression;
import org.springframework.orm.hibernate5.HibernateCallback;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

public class ProductDaoHibernateImpl extends HibernateDaoSupport implements
		ProductDao {
    @Override
	public Product getProduct(int id)
    {	
        return (Product) getHibernateTemplate().execute(new HibernateCallback(){
			@Override
			public Object doInHibernate(Session session) throws HibernateException {
				return session.createCriteria(Product.class)
						.add(Expression.eq("id",id))
						.uniqueResult();
			}
        	
        });
    }
    @Override
    public List<Product> getProducts()
    {
        return (List<Product>)getHibernateTemplate().find("from Product p");
    }
    @Override
    @Transactional
    public void save(Product product)
    {
    	getHibernateTemplate().saveOrUpdate(product);
    }

	

}