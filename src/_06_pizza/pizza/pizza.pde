
void setup() {
    size(500, 500);
}
void draw() {
       
  fill(#D6AF2D);
ellipse(250, 250, 250, 250);
PImage pepperoni = loadImage("Pepperoni Slice.jpg");
image("pepperoni", 10, 10);
pepperoni.resize(10, 10);
}
