class DvusveazniiSpisok
public function construct (Sarr, $key) {
$list = new Spisok();
foreach (Sarr as $index =› $value) { $list-›dobavlenie($value-›Skey);
Done
return $list;
class Uzel
public $value;
public $n = NULL;
public $p = NULL;
public function _construct ($value = NULL)
{
$this-›value = $value;
class Spisok §
public $head = NULL;
public function dobavlenie (Svalue)
Suzel = new Uzel ($value);
$this-›dobavlenieUzla(Suzel);
public function dobavlenieUzla(Uzel Suzel)
if (is_null ($this-›head)) { $this-›head = $uzel;
} else {
$temp = $current = $this-›head;
while (lis_null (Scurrent-›next)) {
$temp = $current;
$current = $current-›next;
}
Suzel-›prev = $temp;
Scurrent-›next = Suzel;
public function udalenie($index)
$temp = $current = $this-›head;
$i = 0;
if (Sindex < 0) $index = 0;
if (Sindex == 0) {
$current-›next-›prev = NULL;
$this-›head = $current-›next;
} else {
while (lis_null(Scurrent)) {
if ($i == $index) {
break;
$temp = $current;
$current = current-›next;
}

 if (is _null ($current-›next))
$current-›next = new Uzel();
$temp-›next = $current-›next;
scurrent-›next-›orev-=stemo:
Done
public function vivod()
{
Scurrent = $this-›head;
while (Scurrent-›next != NULL) { print_r(Scurrent-›value $current = $current-›next;
}
print_r($current-›value . "In");
public function posik($value)
{
if (is _null (Sthis-›head)) { return NULL;
] else {
$current = $this-›head;
while ($current-›next != NULL) {
if (Scurrent-›value == $value) {
return $current;
$current = $current-›next;
if (Scurrent-›value return $current;
== Svalue) {
return NULL;
}
