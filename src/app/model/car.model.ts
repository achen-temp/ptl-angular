export class Car {
    model: string;
    image: string;
    price: number

    constructor(model: string, image: string, price: number){
        this.image = image;
        this.model = model;
        this.price = price;
    }
}
