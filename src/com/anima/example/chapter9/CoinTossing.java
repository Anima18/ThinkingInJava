/**
 * 使用工厂方法实现抛硬币功能
 * @author jianjianhong
 *
 */
package com.anima.example.chapter9;

interface Game{
	void Tossing();
} 

interface GameFactory {
	Game getGame();
}

class Coin implements Game {

	@Override
	public void Tossing() {
		System.out.println("抛硬币");
	}
	
}

class CoidFactory implements GameFactory {

	@Override
	public Game getGame() {
		return new Coin();
	}
	
}

class Dice implements Game {

	@Override
	public void Tossing() {
		System.out.println("抛骰子");
	}
	
}

class DiceFactory implements GameFactory {

	@Override
	public Game getGame() {
		return new Dice();
	}
	
}


public class CoinTossing {
	private static void playGame(GameFactory factory) {
		factory.getGame().Tossing();
	}
	
	public static void main(String[] args) {
		playGame(new CoidFactory());
		playGame(new DiceFactory());
	}
}
