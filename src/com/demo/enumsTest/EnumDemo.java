package com.demo.enumsTest;

public class EnumDemo {
	
	public enum Suit{
		DIAMONDS(1, "Diamonds"),
		CLUBS(2, "Clubs"),
		HEARTS(3, "Hearts"),
		SPADES(4, "Spades");
		
		private final int value;
		private final String text;
		
		Suit(int value, String text) {
			this.value = value;
			this.text = text;
		}
		public int getValue() {
			return this.value;
		}
		public String getText() {
			return this.text;
		}
	}
	
	private void show() {
		System.out.println(
				new StringBuilder().append("value - ")
				.append(Suit.CLUBS.getValue())
				.append(" name - ")
				.append(Suit.CLUBS.getText())
				.append(" NAME - ")
				.append(Suit.CLUBS.name())
		);
	}
	
	public static void main(String[] args) {
		EnumDemo demo = new EnumDemo();
		demo.show();
	}

}

