

    <?php 
$servername="localhost";
$username="root";
$password="";
$database="redstore";

$conn=mysqli_connect($servername,$username,$password,$database);
if($conn)
{
    echo "succesfylly";
}
else{
    echo "failed";
}

if($conn)
{
    $name=$_POST['name'];
    $email=$_POST['email'];
    $city=$_POST['city'];
    $address=$_POST['address'];
    $zipcode=$_POST['zipcode'];
    $country=$_POST['country'];

    $sql_query="INSERT INTO billing (name,email,city,address,zipcode,country) VALUES (' $name',' $email','$city','$address',' $zipcode',' $country')";

    if (mysqli_query($conn, $sql_query)) 
	 {
		echo " Details Entry inserted successfully !";
	 } 
	 else
     {
		echo "Error: " . $sql . "" . mysqli_error($conn);
	 }
	 mysqli_close($conn);
}

?>
