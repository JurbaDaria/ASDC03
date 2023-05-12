class Queue
protected $queue;
protected $limit;
public function
_construct($limit = 10, $initial = array ()) {
$this-›queue = $initial;
$this-›limit = $limit;
public function push($item) {
if (count ($this-›queue) < $this-›limit) { array_unshift(Sthis-›queue, Sitem);
public function pop() {
return array_pop ($this-›queue);
public function top() {
return current ($this-›queue);
}
public function out () {
$temp = [];
while ($this-›queue) {
$element - $this-›pop();
print_r(Selement);
$temp[] = $element;
public function search(sitem, $key) {

$temp = New Queue(50);
while ($this-›queue) {
$element = $this-›pop ();
$temp->push (Selement);
if (Selement-›$key == $item) { while (Stemp-›queue) {
$this-›push($temp-›pop ());
}
unset ($temp);
return $element;
while ($temp-›queue) {
$this-›push($temp-›pop());
unset ($temp);
return false;
public function delete($item, $key) {
$temp = New Queue (50);
while ($this-›queue) {
$element = $this-›pop ();
if (Selement -›$key == $item)
break;
$temp-›push($element);
}
while ($temp-›queue) {
$this-›push ($temp-›pop ());
unset ($temp);}
