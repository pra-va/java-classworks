package lt.prava;

/**
 * House class. This is the class to create classes and rooms inside.
 * 
 * @author pra-va
 *
 */
public class House {
	private Room[] rooms;
	private String address;

	/**
	 * House class constructor.
	 * 
	 * @param numberOfRooms - number of rooms user would like to instantiate in this
	 *                      house.
	 * @param roomCapacity  - number of Student objects each room will be able to
	 *                      accommodate.
	 * @param address       - street address and house number.
	 */
	public House(int numberOfRooms, int roomCapacity, String address) {
		rooms = new Room[numberOfRooms];
		createRooms(rooms, roomCapacity);
		this.address = address;
	}

	/**
	 * This method will accommodate list of students to its rooms at room array.
	 * 
	 * @param students - array of students to accommodate to this house.
	 */
	public void accomodateStudent(Student[] students) {
		int studentsLeftToAccommodate = students.length;
		// i - room array iterator
		// j - students array (method parameter) iterator
		for (int i = 0, j = 0; i < rooms.length; i++) {
			int freeSpaces = rooms[i].freePlacesInRoom();
			for (int k = 0; k < freeSpaces; k++) {
				if (studentsLeftToAccommodate > 0) {
					rooms[i].accomodateStudent(students[j]);

					j++;
					studentsLeftToAccommodate--;
				}
			}
		}

		if (studentsLeftToAccommodate == 0) {
			return;
		}

		System.out.println("House at " + this.address + " is full.");
		System.out.println("Students left with no place to live: " + studentsLeftToAccommodate + ".");
	}

	/**
	 * Private method used to create Room objects in this.rooms array with user
	 * provided capacity.
	 * 
	 * @param rooms
	 * @param roomCapacity
	 */
	private void createRooms(Room[] rooms, int roomCapacity) {
		for (int i = 0; i < rooms.length; i++) {
			rooms[i] = new Room(roomCapacity);
		}
	}

	/**
	 * Method to print house name, room list and who lives in each room.
	 */
	public void printRoomList() {
		System.out.println();
		System.out.println("Printing house at " + address + " room and student list.");
		System.out.println();
		for (int i = 0; i < rooms.length; i++) {
			if (rooms[i] != null) {
				System.out.println("Room number: " + this.rooms[i].getRoomNumber() + ".");
				System.out.print("Students living: ");
				this.rooms[i].getStudentList();
				System.out.println();
			} else {
				continue;
			}
		}

	}

}
