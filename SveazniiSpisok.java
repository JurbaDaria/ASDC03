class SveazniiSpisok
public function
_construct(Sarr, $key) {
$list = new Spisok();
foreach (Sarr as $index =› $value) {
$list-›dobavlenie($value-›$key, $index);
}
return $list;
7
class Uzel
{
public $value;
public $n = NULL;
public function _construct ($value)
$this-›value = $value;
}
class Spisok
{
public $current = NULL;
public function dobavlenie ($value)
$node = new Uzel ($value);
$this-›dobavlenieUzla($node, $this-›current);
public function dobavlenieUzla(Uzel $node, &subList)
{
if (is_null ($subList))
{
$subList = $node;
}
else
{
$this-›dobavlenieUzla($node, $subList-›next);
}
return $this;
public function vivod($sublist) {
if ($sublist != NULL) {
print_r($sublist-›value
" ");
$this-›vivod($sublist-›next);
}
}

public function naititlement ($sublist, $item) {
if ($sublist-›value != $item && $sublist !== NULL) { return $this-›naititlement($sublist-›next, $item);
} else {
return $sublist;
public function udalenie($item, $sublist, $next) {
if ($sublist != NULL) {
if ($next-›value == $item) {
• $sublist-›next = $next-›next;
} elseif ($next != NULL) {
if ($next-›value != Sitem) §
$this-›udalenie($item, $sublist-›next, $next-›next);

}
