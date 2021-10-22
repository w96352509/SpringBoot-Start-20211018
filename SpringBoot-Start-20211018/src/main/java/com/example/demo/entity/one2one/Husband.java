package com.example.demo.entity.one2one;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "husband")
public class Husband {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //IDENTITY(1往下設)
	private Long id;
    
    @Column(name="name" , length = 50 , nullable = true)
    private String name;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "wife_id")  //特殊需求配合ALL可自行更改名稱
    private Wife wife ;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Wife getWife() {
		return wife;
	}

	public void setWife(Wife wife) {
		this.wife = wife;
	}

	@Override
	public String toString() {
		return "Husband [id=" + id + ", name=" + name + ", wife=" + (wife==null?"":wife.getName()) + "]";
	}
  
}
