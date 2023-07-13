import { useState } from 'react'
import { BrowserRouter, Route, Routes, useNavigate } from 'react-router-dom'
import './TodoApp.css'

export default function TodoApp() {
    return (
        <div className="TodoApp">
            <BrowserRouter>
                <Routes>
                    <Route path='/' element={<LoginComponent/>}></Route>
                    <Route path='/login' element={<LoginComponent/>}></Route>
                    <Route path='/welcome' element={<WelcomeComponent/>}></Route>
                    <Route path='*' element={<ErrorComponent/>}></Route>
                </Routes>
            </BrowserRouter>    
        </div>
    )
}

function LoginComponent() {

    const [username, setUsername] = useState('in28minutes')
    const [password, setPassword] = useState('')
    const [showSuccessMessage, setshowSuccessMessage] = useState(false)
    const [showErrorMessage, setshowErrorMessage] = useState(false)
    const navigate = useNavigate();


    function handlerUsernameChange(event) {
        setUsername(event.target.value)
    }

    function handlerPasswordChange(event) {
        console.log(event.target.value)
        setPassword(event.target.value)
    }

    function handleSubmit() {
        if(username==='in28minutes' && password==='dummy') {
            console.log('Success')
            setshowSuccessMessage(true)
            setshowErrorMessage(false)
            navigate('/welcome')
        } else {
            console.log('Failed')
            setshowSuccessMessage(false)
            setshowErrorMessage(true)
        }
    }
   
    // function SuccessMessageComponent() {

    //     if(showSuccessMessage) {
    //         return <div className="successMessage">Authenticated Successfully</div>
    //     }
        
    //     return null
        
    // }
    
    // function ErrorMessageComponent() {
    
    //     if(showErrorMessage) {
    //         return <div className="errorMessage">Authentication Failed. Please check your credentials.</div>
    //     }
        
    //     return null   
    // }


    return(
        <div className="Login">
            <h1>Time to Login!</h1>
            {showSuccessMessage && <div className="successMessage">Authenticated Successfully</div>}
            {showErrorMessage && <div className="errorMessage">Authentication Failed. Please check your credentials.</div>}
            <div className="LoginForm">
                <div>
                    <label>User Name:</label>
                    <input type="text" name="username" value={username} onChange={handlerUsernameChange}/>
                </div>
                <div>
                    <label>Password:</label>
                    <input type="text" name="password" value={password} onChange={handlerPasswordChange} />
                </div>
                <div>
                    <button type="button" name="login" onClick={handleSubmit}>login</button>
                </div>
            </div>
        </div>
    )
}

function WelcomeComponent() {
    return (
        <div className="WelcomeComponent">
            <h1>Welcome in28minutes</h1>
            <div>
                Welcome Component
            </div>
        </div>
    )
}

function ErrorComponent() {
    return (
        <div className="ErrorComponent">
            <h1>We are working really hard!</h1>
            <div>
                Apologies for the 404. Reach out to our team at ABC-DEF-GHIj.
            </div>
        </div>
    )
}




