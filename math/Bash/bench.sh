function compute {
    number=$1
    i=0
    while [ $i -lt $number ]; do
        if [ $((i%123)) -eq 0 ]; then
            i=$((i+10));
        else
            i=$((i+1))
        fi
    done
    echo "result is $i"
}

# Too long for 1 000 000 000 so we check with 10 000 000
compute 10000000
