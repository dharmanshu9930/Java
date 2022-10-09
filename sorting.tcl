proc compare { mylist } {
  set len [llength $mylist]
  set len [expr $len-1]
  
  for {set i 0} {$i<$len} {incr i} {
    for {set j 0} {$j<[expr $len-$i]} {incr j} {
      if { [lindex $mylist $j] > [lindex $mylist [expr $j+1]]} {
        set temp [lindex $mylist $j]
        lset mylist $j [lindex $mylist [expr $j+1]]
        lset mylist [expr $j+1] $temp
      }
    }
  }
  puts $mylist
}


set mylist { 7 3 12 9 5 2 1 4 }
compare $mylist