package org.itstep.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table( name = "keywords" )
public class KeyWord {

	@Id
	@Column( name = "keyword")
	private String keyword;
	
	public KeyWord() {
	}

	public KeyWord(String keyword) {
		this.keyword = keyword;
	}
	
	
}
