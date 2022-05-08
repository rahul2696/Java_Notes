            function calcBill()
            {
                nm=document.cust.cnm.value
                amt=document.cust.pamt.value
                if(amt>20000)
                disc=amt*10/100
                else
                disc=amt*7/100

                net=amt-disc
                document.getElementById("bill").innerHTML="Customer Name : "+nm
                document.getElementById("bill").innerHTML+="<br>Purchase amount : "+amt
                document.getElementById("bill").innerHTML+="<br>Discount : "+disc
                document.getElementById("bill").innerHTML+="<br>Net Bill : "+net
            }
            function showdt()
            {
                dt=new Date()
                d=dt.getDate()+"/"+(dt.getMonth()+1)+"/"+(dt.getYear()+1900)
                document.getElementById("dtm").innerHTML="Date : "+d
            }
