package phase1;

import java.text.DecimalFormat;


public class SingleLinkedList<T extends Comparable<T>> {
	private SingleNode<T> head;

	public SingleNode<T> getHead() {
		return head;
	}

	public void setHead(SingleNode<T> head) {
		this.head = head;
	}

	public SingleLinkedList() {
		head = new SingleNode<T>(null);
		head.setData(null);
	}

	public boolean insert(T data) {
		if (this.findNode(data) != null)
			return false;
		SingleNode<T> node = new SingleNode<>(data);
		if (head.getNext() == null) {
			head.setNext(node);
		} else {
			SingleNode<T> prev = head;
			SingleNode<T> curr = head.getNext();
			for (; (curr != null) && (curr.getData().compareTo(node.getData()) < 0); prev = curr, curr = curr.getNext())
				;
			if (head.getNext() == curr) {
				node.setNext(head.getNext());
				head.setNext(node);
			} else if (curr == null) {
				prev.setNext(node);
			} else {
				node.setNext(curr);
				prev.setNext(node);
			}
		}
		return true;
	}

	public SingleNode<T> findNode(T data) {
		SingleNode<T> curr = head.getNext();
		while (curr != null) {
			if (curr.getData().equals(data)) {
				return curr;
			}
			curr = curr.getNext();
		}
		return null;
	}

	public void traverse() {
		SingleNode<T> curr = head.getNext();
		while (curr != null) {
			System.out.print(curr.getData() + "-->");
			if (curr.getData() instanceof Location)
				((Location) curr.getData()).getMartyr().traverse();
			curr = curr.getNext();
		}
	}

	public boolean delete(T data) {
		if (this.findNode(data) == null)
			return false;
		if (head.getNext() != null) {
			SingleNode<T> prev = head, curr = head.getNext();
			for (; curr != null && curr.getData().compareTo(data) < 0; prev = curr, curr = curr.getNext())
				;
			if (curr != null && curr.getData().equals(data)) {
				if (head.getNext() == curr)
					head.setNext(curr.getNext());
				else if (curr.getNext() == null)
					prev.setNext(null);
				else
					prev.setNext(curr.getNext());
			}

		}
		return true;
	}

	public boolean update(T oldData, T newData) {
		if ((this.findNode(oldData) == null || this.findNode(newData) != null)
				&& this.findNode(newData) != this.findNode(oldData))
			return false;

		else {
			SingleNode<T> findDistrict = this.findNode(oldData);
			SingleNode<T> findNewDistrict = this.findNode(oldData);
			if (oldData instanceof Location) {
				this.updateMartyrLocation(oldData, newData);
				this.delete(findDistrict.getData());
				((Location) findNewDistrict.getData()).setLocation(((Location) newData).getLocation());
			} else if (oldData instanceof Martyr) {
				this.delete(findDistrict.getData());
				findNewDistrict.setData(newData);
			}
			this.insert(findNewDistrict.getData());
			return true;
		}
	}

	// count the total number of martyrs
	public int totalNumberOfMartyrs(T location) {
		SingleNode<T> node = this.findNode(location);
		int counter = 0;
		if (node != null) {
			SingleNode<Martyr> currMar = ((Location) node.getData()).getMartyr().getHead().getNext();
			while (currMar != null) {
				counter++;
				currMar = currMar.getNext();
			}

		}

		return counter;
	}

// count the total number of males
	public int totalNumberOfMales(T location) {
		SingleNode<T> node = this.findNode(location);
		int counter = 0;
		SingleNode<Martyr> currMar = ((Location) node.getData()).getMartyr().getHead().getNext();
		while (currMar != null) {
			if (currMar.getData().getGender().equals("M")) {
				counter++;
			}
			currMar = currMar.getNext();
		}

		return counter;
	}

// count the total number of females
	public int totalNumberOfFemale(T location) {
		SingleNode<T> node = this.findNode(location);
		int counter = 0;
		SingleNode<Martyr> currMar = ((Location) node.getData()).getMartyr().getHead().getNext();
		while (currMar != null) {
			if (currMar.getData().getGender().equals("F")) {
				counter++;
			}
			currMar = currMar.getNext();
		}

		return counter;
	}

	// count average martyrs
	public double averageMartyrsAge(T location) {
		DecimalFormat decimalFormat = new DecimalFormat("#.##"); // to print two digits after the comma
		SingleNode<T> node = this.findNode(location);
		double totalAge = 0;
		int counter = this.totalNumberOfMartyrs(location);
		if (counter != 0) {
			SingleNode<Martyr> currMar = ((Location) node.getData()).getMartyr().getHead().getNext();
			while (currMar != null) {
				int age = currMar.getData().getAge();
				totalAge = totalAge + age;
				currMar = currMar.getNext();
			}
			return totalAge / counter;
		} else {
			return 0.0;
		}
	}

	// the oldest martyr
	public SingleNode<T> oldestAge(T location) {
		SingleNode<T> node = this.findNode(location);
		SingleNode<Martyr> currMar = ((Location) node.getData()).getMartyr().getHead().getNext();
		SingleNode<Martyr> oldestMartyr = null;
		int max = 0;
		while (currMar != null) {
			int age = currMar.getData().getAge();
			if (age > max) {
				max = age;
				oldestMartyr = currMar;
			}
			currMar = currMar.getNext();
		}
		return ((SingleNode<T>) oldestMartyr);
	}

	// the youngest martyr
	public SingleNode<T> youngestAge(T location) {
		SingleNode<T> node = this.findNode(location);
		SingleNode<Martyr> currMar = ((Location) node.getData()).getMartyr().getHead().getNext();
		SingleNode<Martyr> youngestMartyr = null;
		int min = 500;
		while (currMar != null) {
			int age = currMar.getData().getAge();
			if (age < min) {
				min = age;
				youngestMartyr = currMar;
			}
			currMar = currMar.getNext();
		}
		return ((SingleNode<T>) youngestMartyr);
	}

	// search for a martyr by part of his name
	public SingleNode<T> findMartyrByPartOfName(T location) {
		SingleNode<T> node = this.findNode(location);
		SingleNode<Martyr> currMar = ((Location) node.getData()).getMartyr().getHead().getNext();
		while (currMar != null) {
			String name = currMar.getData().getName();
			if (name.contains(HBoxMartyr.getTfSearch().getText())) {
				return ((SingleNode<T>) currMar);
			}
			currMar = currMar.getNext();
		}
		return null;
	}

	// to update the location data field
	public void updateMartyrLocation(T oldLocation, T newLocation) {
		SingleNode<T> node = this.findNode(oldLocation);
		SingleNode<Martyr> currMar = ((Location) node.getData()).getMartyr().getHead().getNext();
		while (currMar != null) {
			currMar.getData().setLocation(newLocation + "");
			currMar = currMar.getNext();
		}

	}

	public SingleNode<T> findMartyrByName(T location) {
		SingleNode<T> node = this.findNode(location);
		SingleNode<Martyr> currMar = ((Location) node.getData()).getMartyr().getHead().getNext();
		while (currMar != null) {
			String name = currMar.getData().getName();
			if (name.equals(HBoxMartyr.getTfUpdate().getText())) {
				return ((SingleNode<T>) currMar);
			}
			currMar = currMar.getNext();
		}
		return null;
	}

}
