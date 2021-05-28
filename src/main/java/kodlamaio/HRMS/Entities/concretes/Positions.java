package kodlamaio.HRMS.Entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="positions")
@Data
public class Positions {
	@Id
	@GeneratedValue
	@Column(name="position_id")
	private int PositionId;
	
	@Column(name="position_name")
	private String PositionName;
	
	public Positions() {}

	public Positions(int positionId, String positionName) {
		super();
		PositionId = positionId;
		PositionName = positionName;
	}
	

}
