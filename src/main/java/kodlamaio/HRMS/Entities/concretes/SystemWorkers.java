package kodlamaio.HRMS.Entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="system_workers")
@Data
public class SystemWorkers {
	@Id
	@GeneratedValue
	@Column(name="sys_id")
	private int sys_id;
	@Column(name="sys_first_name")
	private String SysFirstName;
	@Column(name="sys_last_name")
	private String SysLastName;
	@Column(name="sys_email")
	private String SysEmail;
	
	public SystemWorkers() {}

	public SystemWorkers(int sys_id, String sysFirstName, String sysLastName, String sysEmail) {
		super();
		this.sys_id = sys_id;
		SysFirstName = sysFirstName;
		SysLastName = sysLastName;
		SysEmail = sysEmail;
	}
	

	
	
}
