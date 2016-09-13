package dao;

import model.Customer;

import org.springframework.data.repository.CrudRepository;

public interface ICustomerDAO extends CrudRepository<Customer, Long> {

	/**
	 * This method doesn't need to be implemented, because it will be generated
	 * automatically from its signature by Spring Data JPA.
	 */
	public Customer findById(Long id);
}
