package org.itstep.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table( name = "items" )
public class Item {
	
	@Id
	@Column( name = "article_id" )
	private String articleId;
	
	@Column( name = "item_name" )
	private String name;
	
	@ManyToOne
	private KeyWord keyWord;
	
	public Item() {
	}

	public Item(String articleId, String name, KeyWord keyWord) {
		this.articleId = articleId;
		this.name = name;
		this.keyWord = keyWord;
	}

}
