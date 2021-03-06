//	[상속&다형성]
//	=> 패키지 생성 : practice07
//	=> 실행용 클래스: practice07.Run.java
//	=> 기능제공용 클래스: practice07.Item.java
//					practice07.Can.java
//					practice07.Box.java
//					practice07.Door.java
//	
//	[오버라이딩 & 업캐스팅]
//	=> 실행내용:
//	
//	1) 추상클래스 Item을 상속하는 Box, Can, Door를 생성한다.
//	2) 아래 구성요소에 맞춰 각 클래스를 작성한다.
//	Item:	-width:int
//			-height:int
//			-weight:int
//			+Item()
//			+Item(width:int, height:int, weight:int)
//			findItem():void				// 출력구문 참조
//			sellItem():int {abstract}	// 출력구문 참조
//			shakeItem():void {abstract}	// 출력구문 참조
//			openItem():void {abstract}	// 출력구문 참조
//	3) Run 클래스에서 각 객체를 Item 객체로 업캐스팅하여 생성한 뒤
//	   findItem() 메소드 호출
//	4) 생성된 3개의 객체의 오버라이딩 된 메소드를 아래와 같이 각각 호출한다.
//
//	=> 객체생성 예시
//	Item iBox = (Item) new Box(100, 200, 3);
//	Item iCan = (Item) new Can(10, 20, 1);
//	Item iDoor = (Item) new Door(1000, 2000, 10);
//
//	=> 출력 예시
//	iBox.findItem(): 	Item [width=100, height=200, weight=3]을 발견했습니다.
//	iCan.findItem(): 	Item [width=10, height=20, weight=1]을 발견했습니다.
//	iDoor.findItem(): 	Item [width=1000, height=2000, weight=10]을 발견했습니다.
//	
//	iBox.sellItem(): 	900
//	iBox.shakeItem(): 	박스를 흔들었습니다.
//	어제 중*나라에서 산 스피커가 들어있을까요?
//	iBox.openItem(): 	박스를 열었습니다.
//	벽돌이 들어있네요!
//	
//	iCan.sellItem(): 	1000
//	iCan.shakeItem(): 	캔을 흔들었습니다.
//	열면 폭발할 것 같아요!
//	iCan.openItem(): 	캔을 열었습니다.
//	맛있는 참치가 들어있네요!
//	
//	문은 떼다 팔 수 없습니다.
//	iDoor.sellItem(): 	0
//	iDoor.shakeItem(): 	시끄럽게 문을 흔든다고 혼났습니다!
//	iDoor.openItem(): 	문을 열었습니다.

package practice07;

public abstract class Item {

	private int width;
	private int height;
	private int weight;
	
	public Item() {}
	
	public Item(int width, int height, int weight) {
		this.width = width;
		this.height = height;
		this.weight = weight;
	}
	
	public void findItem() {
		System.out.println(this.toString() + "을 발견했습니다.");
	}

	public abstract int sellItem();
	
	public abstract void shakeItem();

	public abstract void openItem();
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Item [width=" + width + ", height=" + height + ", weight=" + weight + "]";
	}
}
