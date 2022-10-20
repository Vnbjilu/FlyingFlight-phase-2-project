package vikas.RatanRaman.Flights;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Flights {
	@Id
	@Column(length=8)
	private String flightNumber;
	
	@Column(length=20)
	private String fromLocation;
	
	@Column(length=20)
	private String toLocation;
	
	@Column(length=12)
	private String arriveTime;
	
	private int capacity;
	
	@Column(length=30)
	private String airlineName;
	
	@Column(length=15)
	private String duration;
	
	@Column(length=12)
	private String departTime;

}
