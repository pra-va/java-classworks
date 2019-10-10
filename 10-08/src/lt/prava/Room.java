package lt.prava;

import java.util.Arrays;

/**
 * Room class. You should not instantiate this class. It is auto-instantiated by
 * house class.
 * 
 * @author pra-va
 *
 */
public class Room {
	private static int roomCounter;
	private int roomNumber = 0;
	private Student[] studentsLiving;

	/**
	 * Room constructor. This method will automatically increment and assign room
	 * number. NOTE that if new house would be created, room numbers counter will
	 * not be restarted from 0.
	 * 
	 * @param capacity - room capacity.
	 */
	public Room(int capacity) {
		studentsLiving = new Student[capacity];
		roomCounter++;
		roomNumber = roomCounter;
	}

	/**
	 * Method, used by House class to accommodate students. If studentsLiving array
	 * would be filled, this method will prompt user that the room is full.
	 * 
	 * @param student to accommodate
	 */
	public void accomodateStudent(Student student) {
		for (int i = 0; i < studentsLiving.length; i++) {
			if (studentsLiving[i] == null) {
				studentsLiving[i] = student;
				System.out.println("Accomodating " + student.getName() + " to room " + roomNumber);
				if (i == studentsLiving.length - 1) {
					System.out.println("Room " + roomNumber + " is full.");
					System.out.println();
				}
				return;
			}
		}
		System.out.println("Room " + roomNumber + " is full.");
		System.out.println();
	}

	/**
	 * This method will return free spaces left in this room.
	 * 
	 * @return free spaces left in this room.
	 */
	public int freePlacesInRoom() {
		int counter = 0;
		for (int i = 0; i < studentsLiving.length; i++) {
			if (studentsLiving[i] == null) {
				counter++;
			}
		}
		return counter;
	}

	/**
	 * Will print out students that are living in this room list using toString
	 * method form Student class.
	 */
	public void getStudentList() {
		System.out.println(Arrays.toString(this.studentsLiving));
	}

	/**
	 * 
	 * @return room number in integer format.
	 */
	public int getRoomNumber() {
		return roomNumber;
	}

}
