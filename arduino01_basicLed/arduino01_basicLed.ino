//전역선언영역
int ledPin=13;


void setup() {
 //연결선에 대한 입/출력 설정
 pinMode(ledPin, OUTPUT);
  
}

void loop() {
  digitalWrite(ledPin, HIGH); //5v 전류를 보냄
  delay(2000); //5v전류를 보내는 시간 1/1000초 동안 실행

  digitalWrite(ledPin, LOW);  //0V 전류를 보냄
  delay(2000);  
}
