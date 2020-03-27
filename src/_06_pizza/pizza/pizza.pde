
void setup() {
    size(500, 500);
    fill(#D6AF2D);
ellipse(250, 250, 250, 250);
fill(#E00707);
ellipse(250,250,200,200);
fill(#F6FA97);
ellipse(250,250,180,180);
}
void draw() {
PImage pepperoni = loadImage("PepperoniSlice.jpg");
pepperoni.resize(50, 50);
image(pepperoni, 250, 250);
if(mousePressed){
  image(pepperoni, mouseX, mouseY);
}
}
