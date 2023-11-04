package prog.dist.api.model;

import java.util.List;

public class Room {
    private Integer roomNumber;
    private Boolean roomStatus;
    public Integer clientId;
    private Double roomPrice;
    private String bedType;

    public Room() {}
    public Room(Integer roomNumber, Boolean roomStatus, Integer clientId, Double roomPrice, String bedType) {
        this.roomNumber = roomNumber;
        this.roomStatus = roomStatus;
        this.clientId = clientId;
        this.roomPrice = roomPrice;
        this.bedType = bedType;
    }

    public String getBedType() {
        return bedType;
    }

    public void setBedType(String bedType) {
        this.bedType = bedType;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Boolean getRoomStatus() {
        return roomStatus;
    }

    public void setRoomStatus(Boolean roomStatus) {
        this.roomStatus = roomStatus;
    }

    public Double getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(Double roomPrice) {
        this.roomPrice = roomPrice;
    }
}
