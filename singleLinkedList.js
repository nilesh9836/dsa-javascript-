// Online Javascript Editor for free
// Write, Edit and Run your Javascript code using JS Online Compiler

//console.log("Try programiz.pro");

class LinkedList {
    constructor(value) {
        this.head = {
            value: value,
            next: null
        };
        this.tail = this.head;
        this.length =1;
        return this;
    }
    
    append(value) {
        const newNode = {
            value: value,
            next: null
        };
        this.tail.next = newNode;
        this.tail = newNode;
        this.length++;
        return this;
    }
    
    prepend(value) {
        const newNode = {
            value: value,
            next: null
        };
        newNode.next = this.head;
        this.head = newNode;
        this.length++;
        return this;
    }
    
    insert(value,index) {
        
        if(index >= this.length) {
            return this.append(value);
        }
        const newNode = {
            value: value,
            next: null
        }
        let leaderNode = this.traverse(index-1);
        let holdingPointer = leaderNode.next;
        leaderNode.next = newNode;
        newNode.next = holdingPointer;
        this.length++;
        return this;
        
    }
    remove(index) {
        if(index >= this.length) return;
        let targetNode =  this.traverse(index);
        let leaderNode = this.traverse(index-1);
        let holdingPointer = targetNode.next;
        leaderNode.next = holdingPointer;
        this.length--;
        return this;
    }
    
    traverse(index) {
        let counter = 0;
        let leaderNode = this.head;
        while(counter !== index) {
            leaderNode = leaderNode.next;
            counter++;
        }
        return leaderNode;
    }
    
    printList(){
        const arr = [];
        let currentNode = this.head;
        while(currentNode != null) {
            arr.push(currentNode.value);
            currentNode = currentNode.next;
        }
        return arr;
    }
    
}

const list = new LinkedList(60);
list.append(12);
list.append(5);
list.prepend(4);
console.log(list.printList());
list.insert(89,2)
list.insert(56,6788);
console.log(list.printList());
list.remove(14444);
list.insert(78,3);
//console.log(list.traverse(2));
console.log(list.printList());
//console.log(list);
