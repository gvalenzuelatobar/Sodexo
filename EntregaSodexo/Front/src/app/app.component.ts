import { Component, ViewChild } from '@angular/core';
import { MatPaginator } from '@angular/material/paginator';
import { MatTableDataSource } from '@angular/material/table';
import { ServicioService } from 'src/app/servicio.service';
import { HttpClientModule } from '@angular/common/http';
import { DatePipe } from '@angular/common'

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
  providers: [ServicioService, HttpClientModule]
})
export class AppComponent {
  columnas: string[] = ['titulo', 'descripcion', 'resumen', 'favorito', 'fecha_Publicacion', 'fecha_guardado'];

  noticias: Noticias[] = [];
  favoritos: Noticias[] = [];
  dataSource:any;
  dataFavoritos:any;

  showF:boolean = false;
  showN:boolean= false;



  @ViewChild(MatPaginator, { static: true }) paginator!: MatPaginator;

  constructor(
    private servicio :ServicioService,
  
  ){}
  
  ngOnInit() {
    
    this.llenarDatos();
  }

  tipo(tipo:number) {
    console.log("tipo " , tipo)
    if(tipo==1){
      this.showN=true
      this.showF=false
      this.dataSource = new MatTableDataSource<Noticias>(this.noticias);
      this.dataSource.paginator = this.paginator;
    }else{
      console.log("this.favoritos  " , this.dataFavoritos)
      this.dataFavoritos= new MatTableDataSource<Noticias>(this.favoritos);
      this.dataFavoritos.paginator = this.paginator;    
      this.showN=false
      this.showF=true
    }
  }
  llenarDatos(){

    this.servicio.getListaNoticiasService().subscribe(
      response =>{
        console.log("respnse  " , response)
        this.noticias = response.data.noticias
      })

      this.servicio.getListaNoticiasService().subscribe(
        response =>{
          console.log("respnse  " , response)
          this.favoritos = response.data.favoritos
        })

  }

  
}

export class Noticias {
  constructor(
    public titulo: string, 
    public descripcion: string, 
    public resumen: string,
    public favorito: number,
    public fecha_Publicacion: number,
    public fecha_guardado: number
    ) {
  }

  llenarNoticias(){
    const lista :Noticias[]=[
      new Noticias("" ,"" ,  "", 1 , 1 , 1 ),
      new Noticias("" ,"" ,  "", 1 , 1 , 1 )
    ]
    
  }
 
  
}