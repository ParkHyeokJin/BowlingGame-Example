_이글은 백명석님의 강의를 학습하면서 정리 된 자료 입니다._

### 개요
볼링 게임 점수 계산을 하는 프로그램을 TDD로 작성 해보자.  
볼링 게임 예제 소스 : (https://github.com/ParkHyeokJin/BowlingGame-Example.git)

### 규칙
- 볼링 게임은 10개의 프레임으로 구성된다.
- 각프레임은 대개 2 룰을 갖는다(10개의 핀을 쓰러뜨리기 위해 2번의 기회를 갖는다)
- Spare: 10 + next first roll 에서 쓰러 뜨린 핀수.
- Strike : 10 + next two rolls 에서 쓰러 뜨린 핀수.
- 10th 프레임은 특별. spare 처리하면 3번 던질 수 있음.

### 목적
- Game이라는 클래스를 생성하는 것

| Game |  
|:---:|
|+ roll(pins : int) | 
|+ score() : int |  

- Game.class 
    - roll과 score 라는 2개의 메소드를 갖는다.
    - roll메소드는 ball을 roll할 때마다 호출 된다. 인자로는 쓰러뜨린 핀수를 갖는다
    - score 메소드는 게임이 끝난 후에만 호출 되어 게임의 점수를 반환한다.

- 자세한 설명은 blog 에서 (https://parkhyeokjin.github.io/others/2019/06/18/CleanCode-Bowling.html)