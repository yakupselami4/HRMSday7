package kodlamaio.HRMS.Entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="job_seekers")
@Data
public class JobSeekers {
	@Id
	@GeneratedValue
	@Column(name="js_id")
	private int js_id;
	
	@Column(name="js_first_name")
	private String JSFirstName;
	
	@Column(name="js_last_name")
	private String JSLastName;
	
	@Column(name="js_nationality_id")
	private String JSNationalityId;
	
	@Column(name="jd_email")
	private String JSEmail;
	
	@Column(name="js_password")
	private String JSPassword;
	
	@Column(name="js_password_repeat")
	private String JSPasswordRepeat;
	
	public JobSeekers() {}
	
	public JobSeekers(int js_id, String jSFirstName, String jSLastName, String jSNationalityId, String jSEmail,
			String jSPassword, String jSPasswordRepeat) {
		super();
		this.js_id = js_id;
		JSFirstName = jSFirstName;
		JSLastName = jSLastName;
		JSNationalityId = jSNationalityId;
		JSEmail = jSEmail;
		JSPassword = jSPassword;
		JSPasswordRepeat = jSPasswordRepeat;
	}
	
	

}
