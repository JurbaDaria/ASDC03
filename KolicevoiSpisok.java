class KolicevoiSpisok
public function construct (Sarr, $key) {
$list = new Spisok();
foreach (Sarr as $index => $value) {
$list-›dobaviti ($value->$key, $index);
return $list;
class Uzel
public $value;
public $next = NULL;
public function __construct ($value)
$this-›value = $value;
class Spisok {
public $head = NULL;
public function dobaviti($value)
$node = new Uzel ($value);
$this-›dobavitiUzel($node);
public function dobavitiuzel (Uzel $node)
$current = $this-›head;
$node-›next = $node;
if (!is_null ($current)) {
while (Scurrent-›next != $this-›head) { $current = $current-›next;
Scurrent-›next = $node;
$node-›next = $this-›head;
} else {
$this-›head = $node;
public function vivod()
$current = $this-›head;
while (Scurrent-›next != $this-›head)
print_r($current-›value.'
Scurrent = $current -›next;
print_r (Scurrent-›value. "In");
public function udaliti (Sindex)
$temp = $current = $this-›head;
if (Scurrent-›next == $current) { $this-›head = NULL;
} else
$i = 0;
if (Sindex < 0) $index = 0;

 (Sindex == 0) {
while ($current-›next != $this-›head) { $current = $current-›next;
Scurrent-›next = $this-›head-›next;
$this-›head - $this-›head-›next;
} else {
while ($current-›next !- $this-›head) {
$temp = Scurrent;
$current = $current -›next;
if ($i -= $index) {
break;
7
$temp-›next = $current-›next;
public function poisk($value)
if (is _null ($this-›head))
- return NULL;
$current = $this-›head;
while (Scurrent-›next != $this-›head) { if (Scurrent-›value == $value) {
return scurrent:
}
$current = $current-›next;
if (Scurrent-›value == $value) {
return $current;
return NULL
  }
