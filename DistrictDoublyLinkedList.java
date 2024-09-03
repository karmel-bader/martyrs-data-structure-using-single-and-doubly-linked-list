package phase1;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;

import application.Phase1Fx;


public class DistrictDoublyLinkedList<T extends Comparable<T>> {
	private DNode<T> head;

	public DistrictDoublyLinkedList() {
		head = new DNode<T>(null);
		head.setData(null);
	}

	public boolean insert(T data) {
		if (this.findDistrict(data) != null)
			return false;
		DNode<T> node = new DNode<>(data);
		DNode<T> curr = head.getNext(), pre = head;
		if (head.getNext() == null) {
			head.setNext(node);
		} else {
			for (; (curr != null) && (curr.getData().compareTo(node.getData()) < 0); pre = curr, curr = curr.getNext())
				;
			if (head.getNext() == curr) {
				node.setNext(head.getNext());
				head.getNext().setPrev(node);
				head.setNext(node);
			} else if (curr == null) {
				pre.setNext(node);
				node.setPrev(pre);
			} else {
				node.setPrev(curr.getPrev());
				node.setNext(curr);
				curr.setPrev(node);
				pre.setNext(node);
			}

		}
		return true;
	}

	public DNode<T> getHead() {
		return head;
	}

	public void setHead(DNode<T> head) {
		this.head = head;
	}

	public DNode<T> findDistrict(T data) {
		DNode<T> curr = head.getNext();
		while (curr != null) {
			if (((District) curr.getData()).getDistrict().equals(((District) data).getDistrict())) {
				return curr;
			}
			curr = curr.getNext();
		}
		return null;
	}

	public void traverse() {
		DNode<T> curr = head.getNext();
		System.out.print("Head -->");
		while (curr != null) {
			System.out.print(curr + "-->");
			((District) curr.getData()).getLocation().traverse();
			curr = curr.getNext();
			System.out.println("Null");
		}
	}

// update 
	public boolean update(T oldData, T newData) {
		if (this.findDistrict(oldData) == null || this.findDistrict(newData) != null)
			return false;
		else {
			DNode<T> findDistrict = this.findDistrict(oldData);
			DNode<T> findNewDistrict = this.findDistrict(oldData);
			this.updateMartyrDistrict(oldData, newData);
			this.delete(findDistrict.getData());
			((District) findNewDistrict.getData()).setDistrict(((District) newData).getDistrict());
			this.insert(findNewDistrict.getData());
		}
		return true;
	}

	public void delete(T data) {
		if (this.findDistrict(data) == null)
			return;
		DNode<T> node = new DNode<>(data);
		DNode<T> curr = head.getNext(), pre = head;
		for (; (curr != null) && (curr.getData().compareTo(data) < 0); pre = curr, curr = curr.getNext())
			;
		if (curr != null && node.getData().compareTo(data) == 0 && curr.getNext() == null) {
			pre.setNext(null);
			curr.setPrev(null);
		}else if(pre==head) {
			curr.getNext().setPrev(null);
			head.setNext(curr.getNext());
		} else {
			pre.setNext(curr.getNext());
			pre.getNext().setPrev(pre);
			curr.setPrev(null);
		}
	}

// count number of martyrs by date
	public int numberOfMartyrsByDate(String date) {
		DNode<T> curr = head.getNext();
		int counter = 0;
		while (curr != null) {
			SingleNode<Location> currLocation = ((District) curr.getData()).getLocation().getHead().getNext();
			while (currLocation != null) {
				SingleNode<Martyr> currMar = ((Location) currLocation.getData()).getMartyr().getHead().getNext();
				while (currMar != null) {
					if (currMar.getData().getDate().equals(date)) {
						counter++;
					}
					currMar = currMar.getNext();
				}
				currLocation = currLocation.getNext();
			}
			curr = curr.getNext();

		}
		return counter;
	}

	public int numberOfMartyrsForADistrict(T district, String date) {
		int counter = 0;
		DNode<T> node = this.findDistrict(district);
		SingleNode<Location> currLocation = ((District) node.getData()).getLocation().getHead().getNext();
		while (currLocation != null) {
			SingleNode<Martyr> currMar = ((Location) currLocation.getData()).getMartyr().getHead().getNext();
			while (currMar != null) {
				if (currMar.getData().getDate().equals(date)) {
					counter++;
				}
				currMar = currMar.getNext();
			}
			currLocation = currLocation.getNext();
		}

		return counter;
	}

// total number of martyrs in specific district
	public int totalNumberOfMartyrs(T district) {
		DNode<T> node = this.findDistrict(district);
		int counter = 0;
		SingleNode<Location> currLocation = ((District) node.getData()).getLocation().getHead().getNext();
		while (currLocation != null) {
			SingleNode<Martyr> currMar = ((Location) currLocation.getData()).getMartyr().getHead().getNext();
			while (currMar != null) {
				counter++;
				currMar = currMar.getNext();
			}
			currLocation = currLocation.getNext();
		}

		return counter;
	}

// count number of males
	public int totalNumberOfMales(T district) {
		DNode<T> node = this.findDistrict(district);
		int counter = 0;
		SingleNode<Location> currLocation = ((District) node.getData()).getLocation().getHead().getNext();
		while (currLocation != null) {
			SingleNode<Martyr> currMar = ((Location) currLocation.getData()).getMartyr().getHead().getNext();
			while (currMar != null) {
				if (currMar.getData().getGender().equals("M")) {
					counter++;
				}
				currMar = currMar.getNext();
			}
			currLocation = currLocation.getNext();
		}

		return counter;
	}

// count number of females
	public int totalNumberOfFemale(T district) {
		DNode<T> node = this.findDistrict(district);
		int counter = 0;
		SingleNode<Location> currLocation = ((District) node.getData()).getLocation().getHead().getNext();
		while (currLocation != null) {
			SingleNode<Martyr> currMar = ((Location) currLocation.getData()).getMartyr().getHead().getNext();
			while (currMar != null) {
				if (currMar.getData().getGender().equals("F")) {
					counter++;
				}
				currMar = currMar.getNext();
			}
			currLocation = currLocation.getNext();
		}

		return counter;
	}

// count averge martyrs
	public double averageMartyrsAge(T district) {
		DNode<T> node = this.findDistrict(district);
		double totalAge = 0;
		int counter = this.totalNumberOfMartyrs(district);
		if (counter != 0) {
			SingleNode<Location> currLocation = ((District) node.getData()).getLocation().getHead().getNext();
			while (currLocation != null) {
				SingleNode<Martyr> currMar = ((Location) currLocation.getData()).getMartyr().getHead().getNext();
				while (currMar != null) {
					int age = currMar.getData().getAge();
					totalAge = totalAge + age;
					currMar = currMar.getNext();

				}
				currLocation = currLocation.getNext();
			}

			return totalAge / counter;
		} else {
			return 0.0;
		}
	}

// the date which has the max numbers of martyrs
	public String maxDate(T district) {
		DNode<T> node = this.findDistrict(district);
		int max = 0;
		String maxDate = null;
		SingleNode<Location> currLocation = ((District) node.getData()).getLocation().getHead().getNext();
		while (currLocation != null) {
			SingleNode<Martyr> currMar = ((Location) currLocation.getData()).getMartyr().getHead().getNext();
			while (currMar != null) {
				int numberOfMartyrs = this.numberOfMartyrsForADistrict(node.getData(), currMar.getData().getDate());
				if (numberOfMartyrs > max) {
					max = numberOfMartyrs;
					maxDate = currMar.getData().getDate();
				}
				currMar = currMar.getNext();
			}
			currLocation = currLocation.getNext();

		}

		return maxDate;

	}

	// update district data field
	public void updateMartyrDistrict(T district, T newDis) {
		DNode<T> node = this.findDistrict(district);
		SingleNode<Location> currLocation = ((District) node.getData()).getLocation().getHead().getNext();
		while (currLocation != null) {
			SingleNode<Martyr> currMar = ((Location) currLocation.getData()).getMartyr().getHead().getNext();
			while (currMar != null) {
				currMar.getData().setDitrict(newDis + "");
				currMar = currMar.getNext();
			}
			currLocation = currLocation.getNext();
		}

	}

// write to the file
	public void print() {
		try {
			PrintWriter pw = new PrintWriter(Phase1Fx.getFile());
			DNode<T> curr = head.getNext();
			pw.write("Name," + "date," + "Age," + "Location," + "District," + "Gender" + "\n");
			while (curr != null) {
				SingleNode<Location> currLocation = ((District) curr.getData()).getLocation().getHead().getNext();
				while (currLocation != null) {
					SingleNode<Martyr> currMar = ((Location) currLocation.getData()).getMartyr().getHead().getNext();
					while (currMar != null) {
						String name = currMar.getData().getName();
						String date = currMar.getData().getDate();
						int Age = currMar.getData().getAge();
						String location = currMar.getData().getLocation();
						String district = currMar.getData().getDitrict();
						String gender = currMar.getData().getGender();
						String data = name + "," + date + "," + Age + "," + location + "," + district + "," + gender;
						pw.write(data + "\n");
						data = "";
						currMar = currMar.getNext();
					}
					currLocation = currLocation.getNext();
				}
				curr = curr.getNext();

			}
			pw.close();
		} catch (IOException ex) {

		}

	}
}
