package com.savvis.it.demo.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlRootElement(name = "CustomerProduct")
public class CustomerProduct {
	
	protected Integer id;
	protected String name;
	
	@XmlElement(name = "id", required = true)
    public Integer getId() {
        return id;
    }
	
	public void setId(Integer id) {
		this.id = id;
	}
    
	@XmlElement(name = "name", required = true)
    public String getName() {
        return name;
    }

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "DemoProduct [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CustomerProduct other = (CustomerProduct) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
    
	
    
}