protected $queue;
protected $limit;
public function
_construct($limit = 10, $initial = array()) {
$this-›queue = $initial;
$this-›limit $limit;
public function push ($item) {
if (count ($this-›queue) < $this-›limit) { array_unshift($this-›queue, Sitem);
public function pop() {
return array shift($this-›queue);
public function top() {
return current ($this-›queue);
}
public function out () {
$temp
= [1;
while ($this-›queue) {
$element = $this-›pop();
print_r ($element);
Stemp[] = $element;
public function search($item, $key) {
$temp = New Stack(50);
while (Sthis-›queue) §
$element = $this-›pop();
$temp-›push ($element);
if (Selement-›$key == $item) { while (Stemp-›queue) {
$this-›push($temp-›pop ());
- unset ($temp) ;
return $element;
while ($temp-›queue) {
$this-›push ($temp-›pop ()) ;
unset ($temp);
return false;
public function delete($item, $key) {
$temp = New Stack(50);
while ($this-›queue) {
Selement = $this->pop);
if (Selement-›$key == $item) {

break;}
$temp-›push (Selement);
}
while (Stemp-›queue)
$this-›push (Stemp-›pop());}
unset (Stemp);
}
}
