export class UserInfo {
    
    private _name: string;
    private _email: string;
    private _zip: string;

    constructor(_name: string, _email: string, _zipcode: string){
        this._name = _name;
        this._email = _email;
        this._zip = _zipcode;
    }

    public get name(): string{
        return this._name;
    }

    public set name(name: string){
        this._name = name;
    }

    public get email(): string{
        return this._email;
    }

    public set email(email: string){
        this._email = email;
    }

    public get zip(): string{
        return this._zip;
    }

    public set zip(_zip: string){
        this._zip = _zip;
    }

}
