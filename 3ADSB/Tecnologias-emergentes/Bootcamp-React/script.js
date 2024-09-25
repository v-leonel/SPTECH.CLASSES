// var container = document.getElementById('root');
// var titulo = document.createElement('h1');
// titulo.innerHTML = "Título inserido pelo JS :P";
// container.appendChild(titulo);


// var container = document.getElementById('root');
// function Titulo() {
//     return (
//         <h1>Título inserido por JSX :D</h1>
//     );
// }
// // ReactDOM.render(<Titulo />, container); Versão antiga do react 
// ReactDOM.createRoot(container).render(<Titulo />);

// var container = document.getElementById('root');
// function Titulo() {
//     return (
//         <React.Fragment>
//             <h1>Esse título foi feito em react através do JSX: p</h1>
//             <h1>Esta segunda tag foi feita dentro do JSX :P</h1>
//         </React.Fragment>
//     )
// }
// ReactDOM.createRoot(container).render(<Titulo />);


// var container = document.getElementById('root');
// function Titulo(){
//     return (
//         <React.Fragment>
//             <h1>Esse título foi feito em react através do JSX: p</h1>
//             <h1>Esta segunda tag foi feita dentro do JSX :P</h1>
//         </React.Fragment>
//     );
// }

// function Titulos() {
//     return(
//         <div>
//             <Titulo/>
//             <Titulo/>
//             <Titulo/>
//         </div>
//     )
// }
// ReactDOM.createRoot(container).render(<Titulos />);

// var container = document.getElementById("root");
// function Titulo(props) {
//     return (
//         <React.Fragment>
//             <h1>{props.titulo}</h1>
//             <h2>{props.descricao}</h2>
//         </React.Fragment>
//     );
// }
// function Titulos() {
//     return (
//         <>
//             <Titulo titulo="Titulo legal" descricao="Descrição TOP" />
//             <Titulo titulo="Titulo legal legal" descricao="DescriçãoTOP TOP" />
//             <Titulo titulo="Titulo legal legal legal" descricao="Descrição TOP TOP TOP" />
//         </>
//     );
// }
// ReactDOM.createRoot(container).render(<Titulos />);



// var container = document.getElementById("root");
// function Participante(props) {
//     const [numero, setNumero] = React.useState(0);
//     function votar() {
//         setNumero(numero + 1);
//     }
//     return (
//         <>
//             <div>
//                 <h2>{props.nome}</h2>
//                 <h3>{numero}</h3>
//                 <button onClick={votar}>Votar</button>
//             </div>
//         </>
//     );
// }
// function Votacao() {
//     return (
//         <>
//             <h1>Participantes</h1>
//             <Participante nome="Blue Pen" />
//             <Participante nome="Blue Red" />
//             <Participante nome="Blue Orange" />
//         </>
//     )
// }
// ReactDOM.createRoot(container).render(<Votacao />);

var container = document.getElementById("root");

function Participante(props) {
    const [numero, setNumero] = React.useState(0);

    function votar() {
        setNumero(numero + 1);
        props.onVotar();
    }

    return (
        <>
            <div>
                <h2>{props.nome}</h2>
                <h3>{numero}</h3>
                <button onClick={votar}>Votar</button>
            </div>
        </>
    );
}

function TotalVotos(props) {
    return (
        <div>
            <h2>Total de Votos: {props.total}</h2>
        </div>
    );
}

function Votacao() {
    const [totalVotos, setTotalVotos] = React.useState(0);

    function incrementarVotos() {
        setTotalVotos(totalVotos + 1);
    }

    return (
        <>
            <h1>Participantes</h1>
            <Participante nome="Blue Pen" onVotar={incrementarVotos} />
            <Participante nome="Blue Red" onVotar={incrementarVotos} />
            <Participante nome="Blue Orange" onVotar={incrementarVotos} />
            <TotalVotos total={totalVotos} />
        </>
    );
}

ReactDOM.createRoot(container).render(<Votacao />);
