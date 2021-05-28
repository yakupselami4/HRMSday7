package kodlamaio.HRMS.Entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.Data;


@Entity
@Table(name="employers")
@Data

public class Employers {
	
	
	@Id
	@GeneratedValue
	@Column(name="corp_id")
	private int corp_id;
	
	@Column(name="corp_name")
	private String CorpName;
	
	@Column(name="corp_website")
	private String CorpWebsite;
	
	@Column(name="corp_email")
	private String CorpEmail;
	
	@Column(name="corp_phone")
	private String CorpPhone;
	
	@Column(name="corp_password")
	private String CorpPassword;
	
	@Column(name="corp_password_repeat")
	private String CorpPasswordRepeat;
	
	
	
	public Employers() {}

	public Employers(int corp_id, String corpName, String corpWebsite, String corpEmail, String corpPhone,
			String corpPassword, String corpPasswordRepeat) {
		super();
		this.corp_id = corp_id;
		CorpName = corpName;
		CorpWebsite = corpWebsite;
		CorpEmail = corpEmail;
		CorpPhone = corpPhone;
		CorpPassword = corpPassword;
		CorpPasswordRepeat = corpPasswordRepeat;
	}

}
