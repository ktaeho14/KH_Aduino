int speaker = 8;

void setup() {
  pinMode(speaker, OUTPUT);
}

void loop() {
  digitalWrite(speaker, HIGH);
  delay(500);
  digitalWrite(speaker, LOW);
  delay(500);
}
