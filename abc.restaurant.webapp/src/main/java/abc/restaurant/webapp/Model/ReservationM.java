package abc.restaurant.webapp.Model;

import java.time.LocalDate;
import java.time.LocalTime;

public class ReservationM {
    private int id;
    private String customerName;
    private LocalDate reservationDate;
    private LocalTime reservationTime;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public LocalDate getReservationDate() {
		return reservationDate;
	}
	public void setReservationDate(LocalDate reservationDate) {
		this.reservationDate = reservationDate;
	}
	public LocalTime getReservationTime() {
		return reservationTime;
	}
	public void setReservationTime(LocalTime reservationTime) {
		this.reservationTime = reservationTime;
	}

    // Constructors, Getters, and Setters
}